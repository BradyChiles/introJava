
public class Player {
	//Created by Brady Chiles

	private String number;
	private String name;
	private String position;
	
	public Player(){
		
	}
	public Player(String num, String name, String pos){
		setNumber(num);
		setName(name);
		setPosition(pos);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Player [number=" + number + ", name=" + name + ", position=" + position + "]";
	}
	
}
