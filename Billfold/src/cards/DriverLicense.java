package cards;
import java.time.LocalDate;

public class DriverLicense extends Card{
	
	private String dlNumber;
	private LocalDate expirationDate;
	
	public DriverLicense(){
	}
	public DriverLicense(String n, String dlNum, LocalDate e){
		super(n);
		setDlNumber(dlNum);
		setExpirationDate(e);
	}
	public String getDlNumber() {
		return dlNumber;
	}
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	public boolean isExpired(){
		LocalDate current = LocalDate.now();
		LocalDate expires = this.getExpirationDate();
		if(expires.isBefore(current)){
			return true;
		} else {
			return false;
		}

	}
	
	public String format(){
		return super.format() + ", Driver license number: " + dlNumber + ", Expiration date: " + expirationDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dlNumber == null) ? 0 : dlNumber.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DriverLicense other = (DriverLicense) obj;
		if (dlNumber == null) {
			if (other.dlNumber != null)
				return false;
		} else if (!dlNumber.equals(other.dlNumber))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		return true;
	}

	
}
