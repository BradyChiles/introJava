
public class ElectricBlanket extends Blanket{

	private int numHeatSettings;
	private boolean autoShutoff;
	
	public ElectricBlanket(){
		setNumHeatSettings(1);
		setAutoShutoff(false);
	}
	public ElectricBlanket(String s, String c, String m, int h, boolean a){
		setSize(s);
		setColor(c);
		setMaterial(m);
		setNumHeatSettings(h);
		setAutoShutoff(a);
	}
	
	
	public int getNumHeatSettings() {
		return numHeatSettings;
	}
	public void setNumHeatSettings(int numHeatSettings) {
		if(numHeatSettings < 1 || numHeatSettings > 5){
			numHeatSettings = 1;
			this.numHeatSettings = numHeatSettings;
		}else{
			this.numHeatSettings = numHeatSettings;
		}
	}
	public boolean isAutoShutoff() {
		return autoShutoff;
	}
	public void setAutoShutoff(boolean autoShutoff) {
		if(autoShutoff){
		this.price = this.price + 5.75;
		this.autoShutoff = autoShutoff;
		}else{
		this.autoShutoff = autoShutoff;
		}
	}
	public String featureReport(){
		int numHeatSettings = this.getNumHeatSettings();
		boolean autoShutoff = this.isAutoShutoff();
		String with = "";
		if(autoShutoff == true){
			with = "with";
		}else{
			with = "without";
		}
		
		return super.featureReport() + " including " + numHeatSettings + " settings " + with + " auto shut off"; 
	}
}
