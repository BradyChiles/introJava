
public class BlanketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Blanket brady = new Blanket("king","gold","cashmere");
		Blanket noah = new Blanket("twin","black","wool");
		ElectricBlanket mystery = new ElectricBlanket("king","red","cashmere",5,true);
		ElectricBlanket carrie = new ElectricBlanket("queen","multi-colored","cotton",1,false);
		
		System.out.println(brady.featureReport());
		System.out.println(noah.featureReport());
		System.out.println(mystery.featureReport());
		System.out.println(carrie.featureReport());
		
		
		
		
		
		
		
	}

}
