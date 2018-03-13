import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class BullseyeComponent extends JComponent{

	
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.fillOval(0, 0, 300, 300);
		g.setColor(Color.white);
		g.fillOval(20, 20, 260, 260);
		g.setColor(Color.black);
		g.fillOval(40, 40, 220, 220);
		g.setColor(Color.white);
		g.fillOval(60, 60, 180, 180);
		g.setColor(Color.BLACK);
		g.fillOval(80, 80, 140, 140);
		g.setColor(Color.white);
		g.fillOval(100, 100, 100, 100);
		g.setColor(Color.black);
		g.fillOval(120, 120, 60, 60);
	}
}
