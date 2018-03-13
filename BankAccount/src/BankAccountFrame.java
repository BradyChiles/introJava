import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JFrame{
	BankAccount account;
	//private JFrame frame = new JFrame();
	private JLabel amountLabel = new JLabel("Amount: ");
	JTextField amount = new JTextField(7);
	private JLabel balance = new JLabel();
	private JButton deposit = new JButton("Deposit");
	private JButton withdrawl = new JButton("Withdraw");
	
	




	
	
	public BankAccountFrame(BankAccount b){
		account = b;
		
		depositListener d = new depositListener();
		deposit.addActionListener(d);

		withdrawListener w = new withdrawListener();
		withdrawl.addActionListener(w);
		
		JPanel controlPanel = new JPanel();
		controlPanel.add(amountLabel);
		controlPanel.add(amount);
		controlPanel.add(deposit);
		controlPanel.add(withdrawl);
		controlPanel.add(balance);
		add(controlPanel);
		setSize(400,100);
		balance.setText("balance= " + account.getBalance());
		
		
	}
	
	class depositListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {	
			String a = amount.getText();
			double depositAmt = Double.parseDouble(a);
			account.deposit(depositAmt);
			balance.setText("balance=" + account.getBalance());
		}
	}
	
	class withdrawListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String a = amount.getText();
			double withdrawlAmt = Double.parseDouble(a);
			account.withdrawl(withdrawlAmt);
			balance.setText("balance=" + account.getBalance());
		}
	}
}
