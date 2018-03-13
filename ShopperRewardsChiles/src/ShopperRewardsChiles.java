import java.util.Scanner;
public class ShopperRewardsChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		
			System.out.println("Please enter the total price of your groceries: ");
			double groceryCost = in.nextDouble();
			double discountCoupon = 0;
			int gasDiscountMessage = 0;
			int topLevel = 210;
			int secondLevel = 150;
			int thirdLevel = 60;
			int bottomLevel = 10;
			double topLevelDiscount = .14;
			double secondLevelDiscount = .12;
			double thirdLevelDiscount = .10;
			double bottomLevelDiscount = .08;
			
			
			
			
			
			String message = " ";
			
			if(groceryCost>topLevel){
				discountCoupon = groceryCost * topLevelDiscount;
				message = " (14% of your purchase)";
			}else if(groceryCost > secondLevel){
				discountCoupon = groceryCost * secondLevelDiscount;
				message = " (12% of your purchase)";
			}else if(groceryCost > thirdLevel){
				discountCoupon = groceryCost * thirdLevelDiscount;
				message = " (10% of your purchase)";
			}else if(groceryCost > bottomLevel){
				discountCoupon = groceryCost * bottomLevelDiscount;
				message = " (8% of your purchase)";
			}else{
				discountCoupon = 0;
				message = " (You will not receive a coupon)";
			}
			
			double topLevelGas = 99.01;
			double secondLevelGas = 49.01;
			int bottomLevelGas = 1;
		
			if(groceryCost>topLevelGas){
				gasDiscountMessage = 3;
			}else if(groceryCost > secondLevelGas){
				gasDiscountMessage = 2;
			}else if(groceryCost > bottomLevelGas){
				gasDiscountMessage = 1;
			}
			
			System.out.printf("You win a discount coupon of $%.2f",discountCoupon);
			System.out.print(message);
			System.out.print(" and a gas discount of " + gasDiscountMessage + " cents per gallon.");
		
		in.close();
	}

}
