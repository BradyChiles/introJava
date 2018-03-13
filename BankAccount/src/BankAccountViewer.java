import javax.swing.JFrame;

public class BankAccountViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount brady = new BankAccount(1000);
		JFrame frame = new BankAccountFrame(brady);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
