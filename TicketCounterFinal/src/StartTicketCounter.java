import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartTicketCounter {

	public static void main(String[] args) {
		// Created by Brady Chiles

		JFrame frame = new JFrame();
		JPanel panel = new CounterButtons();
	
		frame.add(panel);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
