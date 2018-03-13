import billfold.Billfold;
import cards.*;
import java.time.LocalDate;




public class BillfoldTesterChiles {

	public static void main(String[] args) {
		
		YMCACard brady = new YMCACard("Brady", "125789");
		
		DebitCard mystery = new DebitCard("Mystery", "124789565789", "2578");
		
		Billfold bm = new Billfold();
		bm.addCard(brady);
		bm.addCard(mystery);
		
		System.out.println(bm.formatCards());
		
		
		YMCACard jerry = new YMCACard("Jerry", "145785");
		DriverLicense carrie = new DriverLicense("Carrie","AD1455F8",LocalDate.of(2016, 8, 15));
		
		Billfold jc = new Billfold();
		jc.addCard(jerry);
		jc.addCard(carrie);
		
		System.out.println(jc.getExpiredCardCount());
		
		YMCACard jim = new YMCACard("Jim", "12457GJ");
		YMCACard jake = new YMCACard("Jim", "12457GJ");
		
		System.out.println(jim.equals(jake));
		
		Card a = new Card();
		
	}

}
