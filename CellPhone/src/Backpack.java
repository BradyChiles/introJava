
public class Backpack {

	private Device frontPocket;
	private Device backPocket;
	
	public Backpack(){
		
	}
	
	public Backpack(Device d1,Device d2){
		frontPocket = d1;
		backPocket = d2;
	}
	
	public String reportContents(){
		return "Front pocket contants: " +  frontPocket.toString() + " \nBack pocket contains " + backPocket.toString();
	}
}
