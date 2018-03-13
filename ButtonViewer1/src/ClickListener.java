import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{

	private int clicked;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		clicked++;
		System.out.println("I was clicked " + clicked + " times!");
	}

}
