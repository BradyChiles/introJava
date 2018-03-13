import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class timedResponseChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime time1 = LocalDateTime.now();
		int secs1 = time1.getSecond();
		int mins1 = time1.getMinute();
		
		JOptionPane.showConfirmDialog(null, "Do you enjoy christmas music?");
	
		LocalDateTime time2 = LocalDateTime.now();
		int secs2 = time2.getSecond();
		int mins2 = time2.getMinute();
		
		int differenceSec = secs2 - secs1;
		
		if(mins1 != mins2){
			int minute = 60;
			int minuteDifference = minute - secs1;
			differenceSec = secs2+ minuteDifference;
			
			
		}
		JOptionPane.showMessageDialog(null, "End seconds: " + secs2 + "\nStart seconds: " + secs1 + "\nIt took " + differenceSec + " seconds for you to answer.\nWas it a difficult decision?");
	}
}
