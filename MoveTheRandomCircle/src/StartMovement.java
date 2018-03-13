import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartMovement {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		JPanel panel = new CirclePanel();
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
