
public class equalArraysChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean matchOneTwo = true;
		boolean matchOneThree = true;
		boolean matchOneFour = true;
		 
		int[] one = {1,2,3,4};
		int[] two = {5,6,7,8,9};
		int[] three = {1,2,3,4};
		int[] four ={5,7,8,9};
		
		matchOneTwo = compareArray(one,two);
		matchOneThree = compareArray(one,three);
		matchOneFour = compareArray(one,four);
		System.out.println("Are array one and two equal? " + matchOneTwo);
		System.out.println("Are array one and three equal? " + matchOneThree);
		System.out.println("Are array one and four equal? " + matchOneFour);
	}
	public static boolean compareArray(int[]a1, int[] a2){
		boolean match = true;
		
		if(a1.length != a2.length){
			match = false;
		}else{
			for(int i = 0; i<a1.length; i++){
				if(a1[i] != a2[i]){
					match = false;
				}
			}
		}
			
		return match;
	}

}