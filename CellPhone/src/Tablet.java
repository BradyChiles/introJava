
public class Tablet extends Device{
	
		
	private double screenSize;
	private boolean hasKeyboard;
	
	public Tablet(String brand, String model, double screenSize, boolean hasKeyboard) {
		super(brand, model);
		setScreenSize(screenSize);
		setHasKeyboard(hasKeyboard);
	}
		
	
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	public boolean isHasKeyboard() {
		return hasKeyboard;
	}
	public void setHasKeyboard(boolean hasKeyboard) {
		this.hasKeyboard = hasKeyboard;
	}
	

}
