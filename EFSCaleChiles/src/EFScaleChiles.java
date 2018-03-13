import java.util.Scanner;
public class EFScaleChiles {
//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
		int windSpeed = 0;
		int efRating = 0;
		System.out.print("Please enter the speed of the 3 second wind gust that you would like scaled: ");

		if(in.hasNextInt()){
			windSpeed = in.nextInt();
				if (windSpeed < 65 || windSpeed < 0){
					System.out.println("* Input Error *");
				}else{
					if (windSpeed > 200){
						efRating = 5;
					}else if(200>=windSpeed && windSpeed>=166){
						efRating = 4;
					}else if(165>windSpeed && windSpeed>=136){
						efRating = 3;
					}else if(135>=windSpeed && windSpeed>=111){
						efRating = 2;
					}else if(110>=windSpeed && windSpeed>=86){
						efRating = 1;
					}else if(85>=windSpeed && windSpeed>= 65){
						efRating = 0;
					}
				System.out.println("The EF rating is: " + efRating);
				
				}
			
		}else{
			System.out.println("* Input Error *");
		}
		
		
		
		
		
		
		
		
		in.close();
		
		
	}

}
