import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// this class will create an array of integers of size 5
		Random random = new Random();
		int[] intArr = new int [5];
		char[]charArr = new char [5];
		for (int i = 0; i < intArr.length; i++) {
			
			int temp = random.nextInt(10);
			
			intArr[i]= temp;
			
					System.out.print(intArr[i]);	
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
		//sorts array
		Arrays.sort(arr);
		return arr;
	}

}

