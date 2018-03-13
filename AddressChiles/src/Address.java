
public class Address {
	// Brady Chiles

	private String houseNumber;
	private String street;
	private String apartmentNumber;
	private String city;
	private String state;
	private String postalCode;

	public Address(String houseNum, String street, String city, String state, String postCode) {
		setHouseNumber(houseNum);
		setStreet(street);
		setApartmentNumber("");
		setCity(city);
		setState(state);
		setPostalCode(postCode);

	}

	public Address(String houseNum, String street, String apartment, String city, String state, String postCode) {
		setHouseNumber(houseNum);
		setStreet(street);
		setApartmentNumber(apartment);
		setCity(city);
		setState(state);
		setPostalCode(postCode);
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		if (state.length() < 3 && state.length() > 1) {
			this.state = state;
		} else if(this.state == null){
			throw new IllegalArgumentException("Object not created");
		}else {
			this.state = "error";
		}
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		if (postalCode.length() > 4 && postalCode.length() < 6) {
			this.postalCode = postalCode;
		}else if(this.postalCode == null){
			throw new IllegalArgumentException("Object not created");
		}else {
			this.postalCode = "error";
		}
	}

	public void print() {
		String houseNum = this.getHouseNumber();
		String street = this.getStreet();
		String apartment = this.getApartmentNumber();
		String city = this.getCity();
		String state = this.getState();
		String zip = this.getPostalCode();
		System.out.println(houseNum + " " + apartment + " " + street + "\n");
		System.out.println(city + ", " + state + " " + zip);
	}
}
