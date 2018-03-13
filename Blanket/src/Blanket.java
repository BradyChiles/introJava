import java.text.DecimalFormat;

public class Blanket {

	private String size;
	private String color;
	private String material;
	protected double price = 25;
	
	public Blanket(){
		setSize("twin");
		setColor("blue");
		setMaterial("wool");
	}
	 public Blanket(String s, String c, String m){
		 setSize(s);
		 setColor(c);
		 setMaterial(m);
	 }
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size = size.toLowerCase();
		if(size.equals("twin")){
			this.size = size;
		}else if(size.equals("queen")){
			 price = price + 25;	
			 this.size = size;
		}else if(size.equals("king")){
			price = price + 40;
			this.size = size;
		}else{
			throw new IllegalStateException("Invalid size");	
		}
		
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		material = material.toLowerCase();
		if(material.equals("wool")){
			price = price + 20;
			this.material = material;
		}else if(material.equals("chenille")){
			price = price + 30;
			this.material = material;
		}else if(material.equals("cashmere")){
			price = price + 45;
			this.material = material;
		}
	}
	public double getPrice() {
		return price;
	}
	public String featureReport(){
		String size = this.getSize();
		String color = this.getColor();
		String material = this.getMaterial();
		double price = this.getPrice();
		DecimalFormat d = new DecimalFormat("'$'0.00");
		
		return color + " " +  size + " blanket made from " +  material + ", total price: " + d.format(price);
	}
	
}
