import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class CalcFillDrawing extends JComponent{
	
	
	final int x = 10;
	final int y = 10;
	int width = 170;
	final int height = 30;
	int fillWidth = 0;

	public void paintComponent(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, fillWidth, height);
	}

	public void adjustFill(int num1, int num2){
		
		double total = num1 + num2;
		double percentage = num1/total;
		double fillPercentage = width * percentage;
		System.out.println(fillPercentage);
		fillWidth = (int)fillPercentage;
		repaint();
	}
}
