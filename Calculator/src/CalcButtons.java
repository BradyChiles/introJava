import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcButtons extends JPanel{
	
	JLabel instructions = new JLabel("Enter in two numbers & press submit");
	JTextField firstNumber = new JTextField(5);
	JLabel plusSign = new JLabel(" + ");
	JTextField secondNumber = new JTextField(5);
	JLabel equalSign = new JLabel(" = ");
	JTextField product = new JTextField(5);
	
	CalcFillDrawing draw = new CalcFillDrawing();
	
	public CalcButtons(){
		
		JButton submit = new JButton("Submit");
		JButton clear = new JButton("Clear");
		
		add(instructions);
		add(firstNumber);
		add(plusSign);
		add(secondNumber);
		add(equalSign);
		add(product);
		add(submit);
		add(clear);
		add(draw);
		draw.setPreferredSize(new Dimension (200,60));		//remember to set preferred size
		
		SubmitButtonListener sbl = new SubmitButtonListener();
		submit.addActionListener(sbl);
		
		ClearButtonListener cbl = new ClearButtonListener();
		clear.addActionListener(cbl);
	}
	class SubmitButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{												//remember to create a try catch block when parsing to catch exception
			Integer fN = Integer.parseInt(firstNumber.getText());
			Integer sN = Integer.parseInt(secondNumber.getText());
			product.setText(fN + sN + "");
			draw.adjustFill(fN, sN);
			}catch(NumberFormatException ex){
				System.out.println("Error");
			}
		}
	}
	
	class ClearButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			firstNumber.setText("");
			secondNumber.setText("");
			product.setText("");
			draw.adjustFill(0, 0);
		}
	}
	
}
