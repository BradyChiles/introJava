import java.util.Scanner;
public class TicketCounterChiles {
//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
	int maxTickets = 6;  //total an individual can purchase
	int ticketsAvailable = 75;
	int desiredTickets = 0;
	int numberOfBuyers = 0;
	while(ticketsAvailable > 0){
		
		System.out.println("There are " + ticketsAvailable + "  tickets remaining.");
		System.out.print("How many tickets would you like to purchase? If you would not like to purchase any tickets enter 0. ");
		desiredTickets = in.nextInt();
		if(desiredTickets == 0){
			System.out.println("Are you sure you do not want to purchase any tickets? Y/N?");
			String answer = in.next();
				if(answer.equals("Y") || answer.equals("N")){
					System.out.println("Thank you, have a nice day.");
				}else{
					System.out.println("Input Error....pleae enter Y/N.");
				}
		}else if(desiredTickets <= maxTickets && desiredTickets <= ticketsAvailable){
			System.out.println("You have purchased (" + desiredTickets + ") tickets.");
			ticketsAvailable = ticketsAvailable - desiredTickets;	
			numberOfBuyers ++;
			System.out.println("Next buyer please!");
			System.out.println("--------------------------------------------");
		}else if(desiredTickets > maxTickets){
			System.out.println("Sorry, you can only purchase a maximum of 6 tickets. Please enter a different amount.");
		}else if(desiredTickets > ticketsAvailable){	
			System.out.println("Sorry there are only (" + ticketsAvailable + ") tickets avaiable. Please enter a different amount.");
		
		}
	
			
	}	
	
	System.out.println("Tickets have been sold out!");
	System.out.println("There were " + numberOfBuyers + " buyers.");
	
	
	
	
	in.close();
	
	}
}
	


