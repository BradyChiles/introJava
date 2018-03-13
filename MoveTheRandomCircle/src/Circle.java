import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Circle extends JComponent{
	
	int xValue = 0;
	int yValue = 0;
	Color tempColor = Color.black;
	Color tempOutsideColor = Color.magenta;
	
	public void paintComponent(Graphics g){
		g.setColor(tempColor);
		g.fillOval(xValue, yValue, 100, 100);
		g.setColor(tempOutsideColor);
		g.drawOval(xValue, yValue, 100, 100);
	}
	public void moveTheCircle(){
		xValue = 1 + (int)(Math.random() * 300);
		yValue = 1 + (int)(Math.random() * 300);
		repaint();
	}

	public void changeTheColor(){
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		int r2 = (int)(Math.random() * 256);
		int g2 = (int)(Math.random() * 256);
		int b2 = (int)(Math.random() * 256);
		
		tempColor = new Color(r,g,b);
		tempOutsideColor = new Color (r2,g2,b2);
		repaint();
	}
}
