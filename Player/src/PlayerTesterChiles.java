
public class PlayerTesterChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseballPlayer brady = new BaseballPlayer("45","Brady","Catcher",".500");
		System.out.println(brady.toString());
		
		BaseballPlayer mystery = new BaseballPlayer("13","Mystery","Pitcher",".450");
		System.out.println(mystery.toString());
		
		BasketballPlayer ben = new BasketballPlayer("18","Ben","Center",".560");
		System.out.println(ben.toString());
		
		BasketballPlayer brandon = new BasketballPlayer("58","Brandon","Point Guard",".250");
		System.out.println(brandon.toString());
		
		Roster royals = new Roster();
		royals.addToTeam(brady);
		royals.addToTeam(mystery);
		System.out.println(royals.displayRoster());
		
		Roster mavericks = new Roster();
		mavericks.addToTeam(ben);
		mavericks.addToTeam(brandon);
		System.out.println(mavericks.displayRoster());
	}

}
