import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// this class will create an array of integers of size 5
		Random random = new Random();
		int[] intArr = new int [5];
		char[]charArr = new char [5];
		
		System.out.print("Original: ");
		for (int i = 0; i < intArr.length; i++) {
			
			int temp = random.nextInt(10);
			
			intArr[i]= temp;
			//prints original array
					System.out.print(+intArr[i]);	
			}
		intSort(intArr);
		System.out.print("\nSorted: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(+intArr[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < charArr.length; i++) {
		
		char tempchar = (char)(random.nextInt(26) + 'a');
		
		charArr[i] = tempchar;
		System.out.print(charArr[i]);
		}
		

		System.out.println("\nSorted: ");
		charSort(charArr);
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
			}

	}
	
	static char[] charSort(char[] arr) {
		
		Arrays.sort(arr);
		return arr;
	}


		
		
		

	}
static int[] intSort(int[] arr){
	Arrays.sort(arr);
	
	return arr;
	
}

}

