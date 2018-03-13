
public class BaseballPlayer extends Player{
	
	private String battingAverage;

	public BaseballPlayer(){
		
	}
	public BaseballPlayer(String num, String name, String pos, String batAvg){
		super(num, name, pos);
		setBattingAverage(batAvg);
	}
	public String getBattingAverage() {
		return battingAverage;
	}
	public void setBattingAverage(String battingAverage) {
		this.battingAverage = battingAverage;
	}
	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return super.getNumber();
	}

	@Override
	public void setNumber(String number) {
		// TODO Auto-generated method stub
		super.setNumber(number);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return super.getPosition();
	}

	@Override
	public void setPosition(String position) {
		// TODO Auto-generated method stub
		super.setPosition(position);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "batting average= " + battingAverage;
	}

}
