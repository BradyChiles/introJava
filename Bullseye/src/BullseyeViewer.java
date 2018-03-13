import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BullseyeViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BullseyeComponent b = new BullseyeComponent();
		b.setPreferredSize(new Dimension(300,300));
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		frame.add(panel);
		panel.add(b);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	
		
		
	}

}
