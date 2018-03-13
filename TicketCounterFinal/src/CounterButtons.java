import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CounterButtons extends JPanel{
//Created by Brady Chiles
	int ticketsRemaining = 75;
	int maxOrder = 6;
	int minOrder = 1;
	
	JLabel instructions = new JLabel("Enter how many tickets you would like to purchase (1-6): ");
	JTextField ticketsDesired = new JTextField(10);
	JLabel ticketsRemainingLabel = new JLabel(ticketsRemaining + " tickets remaining.");
	JLabel soldOutMessage = new JLabel();
	CounterDrawing draw = new CounterDrawing();
	
	public CounterButtons(){
		
		JButton purchaseTickets = new JButton("Purchase Tickets");
		
		add(instructions);
		add(ticketsDesired);
		add(purchaseTickets);
		add(ticketsRemainingLabel);
		add(draw);
		draw.setPreferredSize(new Dimension (200,60));
		add(soldOutMessage);
		
		PurchaseButtonListener pBL = new PurchaseButtonListener();
		purchaseTickets.addActionListener(pBL);
	}
	class PurchaseButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try{
			Integer tickets = Integer.parseInt(ticketsDesired.getText());
			
			if(tickets < ticketsRemaining && tickets <= maxOrder && tickets >= minOrder){
				ticketsRemaining = ticketsRemaining - tickets;
				draw.adjustFill(tickets);
				ticketsRemainingLabel.setText("You ordered " + tickets + " tickets. There are " + ticketsRemaining + " remaining.");
				ticketsDesired.setText("");
			}else if(tickets == ticketsRemaining && tickets <= maxOrder && tickets >= minOrder){
				ticketsRemaining = ticketsRemaining - tickets;
				draw.adjustFill(tickets);
				ticketsRemainingLabel.setText("You ordered " + tickets + " tickets. There are " + ticketsRemaining + " remaining.");
				soldOutMessage.setText("Sold Out");
				ticketsDesired.setText("");
			}else if(tickets > maxOrder){
				ticketsRemainingLabel.setText("6 is the max available per order. There are " + ticketsRemaining + " tickets remaining." );
				ticketsDesired.setText("");
			}else if(tickets > ticketsRemaining){
				ticketsRemainingLabel.setText("Sorry. There are only " + ticketsRemaining + " tickets remaining.");
				ticketsDesired.setText("");
			}else if(tickets < minOrder){
				ticketsRemainingLabel.setText("Must order at least one ticket.");
				ticketsDesired.setText("");		
			}
			}catch(NumberFormatException ex){
				ticketsRemainingLabel.setText("Please enter a number only.");
				ticketsDesired.setText("");
			}
		}
		
	}
}
