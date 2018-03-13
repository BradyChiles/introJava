
public class CellPhoneTesterChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CellPhone kelli = new CellPhone();
		kelli.setBrand("LG");
		kelli.setPhoneNumber("5158887777");
		kelli.setCarrier("Google Fi");
		kelli.setModel("Nexus");
		kelli.setHasCamera(true);
		System.out.println(kelli.toString());
		
		 CellPhone tim = new CellPhone("8482836484");
		 tim.setPhoneNumber("1111021192");
		 System.out.println(tim);
		 
		 CellPhone bob = new CellPhone("Apple", "iPhone");
		 System.out.println(bob);
		 
		 CellPhone brady = new CellPhone("5157799872", "Apple", "iPhone");
		 System.out.println(brady);
		 
		 Tablet bill = new Tablet("Samsung", "Edge" ,12.5, true);
		 
		 
		 Backpack backPack = new Backpack(brady, bill);
		 System.out.println(backPack.reportContents());
	}

}
