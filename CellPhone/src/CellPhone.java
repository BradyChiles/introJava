

public class CellPhone extends Device{
	//Brady Chiles

	private String phoneNumber;
	private String carrier;
	private boolean hasCamera;

	
	public CellPhone(){
		
	}
	
	//non-default constructor - has parameter(s)
	public CellPhone(String phoneNumber){
		setPhoneNumber(phoneNumber);
		//setBrand("Nokia");
	}
	
	public CellPhone(String brand, String model){
		super(brand,model);
		//setBrand(brand);
		//setModel(model);
		setPhoneNumber("5152744949");
		
		
		
	}
	
	public CellPhone(String phoneNumber, String brand, String model){
		super(brand, model);
		setPhoneNumber(phoneNumber);
		//setBrand(brand);
		//setModel(model);
		
	}
	
	public String getPhoneNumber(){
		String pN = this.phoneNumber.substring(0, 3) + "-" + this.phoneNumber.substring(3, 6) + "-" + this.phoneNumber.substring(6);
		
		return pN;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public boolean isHasCamera() {
		return hasCamera;
	}

	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}

	@Override
	public String toString() {
		return "CellPhone [phoneNumber=" + phoneNumber + ", carrier=" + carrier + ", hasCamera=" + hasCamera
				+ ", getBrand()=" + getBrand() + ", getModel()=" + getModel() + "]";
	}

	
	
	
}
