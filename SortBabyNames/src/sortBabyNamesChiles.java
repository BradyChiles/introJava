
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class sortBabyNamesChiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
	try{	
		String address =   "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
		URL pageLocation = new URL(address);
		Scanner in = new Scanner(pageLocation.openStream());
		
		
			PrintWriter outGirls = new PrintWriter("Girls.txt");
			PrintWriter outBoys = new PrintWriter("Boys.txt");
			
			
			String name = "";
			
			while(in.hasNextLine()){
				name = in.nextLine();
				if(name.contains("boy")){
					outBoys.println(name);
				}else if(name.contains("girl")){
					outGirls.println(name);
				}
			
				
			}
			outGirls.close();
			outBoys.close();
			in.close();
	}catch(IOException e){
		System.out.println("https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt not found.");
	}
		
	
		
		
		
	}
}
