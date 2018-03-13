
public class BasketballPlayer extends Player{
	
	private String freeThrowPercent;

	public BasketballPlayer(){
		
	}
	public BasketballPlayer(String num, String name, String pos, String fTP){
		super(num, name, pos);
		setFreeThrowPercent(fTP);
	}
	
	public String getFreeThrowPercent() {
		return freeThrowPercent;
	}

	public void setFreeThrowPercent(String freeThrowPercent) {
		this.freeThrowPercent = freeThrowPercent;
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
		return super.toString() + "free throw percentage = " + freeThrowPercent;
	}

}
