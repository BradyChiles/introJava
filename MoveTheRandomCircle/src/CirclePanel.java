import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CirclePanel extends JPanel{
	
	Circle c = new Circle();
	
	public CirclePanel(){
		
		c.setPreferredSize(new Dimension(300,300));
		
		JButton b = new JButton("Move the Circle!");
		JButton tb = new JButton("Change the color!");
		
		TempButtonListener tbl = new TempButtonListener();
		ButtonListener l = new ButtonListener();
		
		b.addActionListener(l);
		tb.addActionListener(tbl);
		
		add(c);
		add(b);
		add(tb);

	}
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Button clicked!");
			c.moveTheCircle();
		}	
	}
	class TempButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Another button was clicked!");
			c.changeTheColor();
		}
		
	}
	
}
