import java.util.Scanner;


public class BookOrderChiles {
	//Brady Chiles
	public static void main(String [] args){
		
		
		double bookSubtotal = 0;
		double TAX = .065;
		double SHIPPING = 2.95;
		double total = 0;
		double bookPrice = 1;
		int numOfBooks = 0;
		double subTotalTax = 0;
		double subTotalShipping = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will calculate your order total.");
		
		while(bookPrice > 0){
		System.out.print("Please enter the price of the book or [0] to exit. ");
		bookPrice = in.nextDouble();
		bookSubtotal = bookSubtotal + bookPrice;
			if(bookPrice > 0){
			numOfBooks ++;
			}
		}
		
		subTotalTax = bookSubtotal * TAX;
		subTotalShipping = numOfBooks * SHIPPING;
		total = bookSubtotal + subTotalShipping + subTotalTax;
		System.out.println("--------------------------------");
		System.out.println("Number of books ordered: " + numOfBooks);
		System.out.printf("Book subtotal is: $%.2f\n",bookSubtotal);
		System.out.printf("Tax: $%.2f\n" ,subTotalTax);
		System.out.printf("Shipping: $%.2f\n",subTotalShipping);
		System.out.println("--------------------------------");
		System.out.printf("Order total: $%.2f\n",total);
		
	
		
		in.close();
			
	}
		

}	
