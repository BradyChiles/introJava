import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class CounterDrawing extends JComponent{
//Created by Brady Chiles

	final int x = 10;
	final int y = 10;
	int width = 170;
	final int height = 30;
	int fillWidth = 0;
	int ticketsSold = 0;
	
	public void paintComponent(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(x, y, width, height);
		g.setColor(Color.blue);
		g.fillRect(x, y, fillWidth, height);
	}
	public void adjustFill(int tickets){
		double totalTickets = 75;
		ticketsSold = ticketsSold + tickets;
		double percentage = ticketsSold/totalTickets;
		double fillPercentage = width * percentage;
		fillWidth = (int)fillPercentage;
		repaint();
	}
}
