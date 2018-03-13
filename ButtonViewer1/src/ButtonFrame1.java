import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame1 extends JFrame{
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 100;
	
	public ButtonFrame1(){
		createComponents();
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
	}
	private void createComponents(){
		JButton button = new JButton("A");
		JButton button2 = new JButton("B");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		add(panel);
		
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		ActionListener listener2 = new ClickListener();
		button2.addActionListener(listener2);
	}
}
