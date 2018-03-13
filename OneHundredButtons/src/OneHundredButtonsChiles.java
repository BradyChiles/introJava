import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OneHundredButtonsChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame= new JFrame();
		frame.setSize(500,500);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel label = new JLabel("Brady Chiles");
		panel.add(label);
		for(int i = 1; i <=100; i++){
			String buttonLabel = String.valueOf(i);
			JButton button = new JButton(buttonLabel);
			
			panel.add(button);
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
