import java.util.Random;
public class randomTenChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomMin = 1;
		int randomMax = 20;
		Random rn = new Random();
		int arrayLength = 10;
		int[] values = new int[arrayLength];
		int firstElement = 0;
		int lastElement = arrayLength - 1;
		
		for(int i = 0; i < values.length; i++){
			int randomNum = rn.nextInt((randomMax - randomMin) + 1) + randomMin;
			values[i] = randomNum;
		}
		
		System.out.print("All array items: ");
		for (int i = 0; i < values.length; i++){      
			System.out.print(values[i] + " ");
		}
		
		System.out.print("\nEven index items: ");
		for(int i = 0; i < values.length; i++){
			if(i%2 == 0){
				System.out.print(values[i] + " ");
			}
		}
		
		System.out.print("\nEven elements: ");
		for(int i = 0; i < values.length; i++){
			if(values[i]%2 == 0){
				System.out.print(values[i] + " ");
			}
		}
		
		System.out.print("\nReversed array: ");
		for(int i = values.length - 1; i >= 0; i--){
			System.out.print(values[i] + " ");
		}
		System.out.print("\nFirst array element: ");
		System.out.print(values[firstElement]);
		
		System.out.print("\nLast array element: ");
		System.out.print(values[lastElement]);
		
		System.out.print("\nHighest number in array: ");
		int largest = values[0];
		for (int i = 1; i < values.length; i++){   
			if (values[i] > largest){
				largest = values[i];
			}
		}
		System.out.print(largest);

		System.out.print("\nLowest number in array: ");
		int smallest = values[0];
		for (int i = 1; i < values.length; i++){   
			if (values[i] < smallest){
				smallest = values[i];
			}
		}
		System.out.print(smallest);
	}

}
