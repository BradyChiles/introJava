
public class YearIncreseChiles {
	//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int START_YEAR = 2015;
		int FACTOR = 5;
		int year = START_YEAR;
		int END_YEAR = 2045; //end year should be the year you want to end not how many years out you want to go.
		
		
		while(year <= END_YEAR){
			System.out.println(year);
			year = year + FACTOR; //you need to increase the year each time, otherwise an endless loop is created.
		}
	}

}
