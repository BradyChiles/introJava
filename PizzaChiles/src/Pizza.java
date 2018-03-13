
public class Pizza extends MenuItem{
	// Brady Chiles

	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	public Pizza(String t, String s, double p) {
		setTopping(t);
		setSize(s);
		setPrice(p);
		
		nextOrderNumber++;
		this.orderNumber = nextOrderNumber;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSize() {
		return size;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}


	public void setSize(String size) {
		size = size.toLowerCase();
		if (size.equals("small") || size.equals("medium") || size.equals("large") || size.equals("extra large")) {
			this.size = size;
		}else{
			this.size = "error";
			if(this.size.equals("error")){
				throw new IllegalArgumentException("Object not created");
			}
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String repeatOrder() {
		String size = this.getSize();
		String topping = this.getTopping();
		double price = this.getPrice();
		int orderNumber = this.getOrderNumber();

		return super.getDescription() + "Order number: " + orderNumber + " Topping: " + topping + " Size: " + size + " Price: $" + price;
	}
	public static Pizza quickOrder(String topping){

		Pizza p = new Pizza(topping, "large", 9.99);

		return p;

		}
}
