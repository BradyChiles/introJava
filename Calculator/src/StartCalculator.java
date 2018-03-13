import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartCalculator {

	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		JPanel panel = new CalcButtons();
		
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
