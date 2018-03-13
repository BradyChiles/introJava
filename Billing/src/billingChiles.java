
public abstract class billingChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill = 0;
		
		bill = computePhotoBill(19.99);   // 21.19
		System.out.printf("Your bill is: %.2f\n", bill);
		bill = computePhotoBill(19.99, 2);   // 42.38
		System.out.printf("Your bill is: %.2f\n", bill);
		bill = computePhotoBill (19.22, 2, .1);   // 36.67
		System.out.printf("Your bill is: %.2f\n", bill);
	}
	public static double computePhotoBill(double price){
		double totalBill = 0;
		double tax = .06;
		totalBill = price + (price * tax);
		return totalBill;
	}
	public static double computePhotoBill(double price, int quantity){
		double totalPrice = price * quantity;
		double totalBill = 0;
		double tax = .06;
		totalBill = totalPrice + (totalPrice * tax);
		return totalBill;
	}
	public static double computePhotoBill(double price, int quantity, double coupon){
		double totalPrice = (price * quantity) - (price * quantity * coupon);
		double tax = .06;
		double totalBill = 0;
		totalBill = totalPrice + (totalPrice * tax);
		return totalBill;
	}
}
