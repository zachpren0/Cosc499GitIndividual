import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class charSortTest {

	@Test
	public void test() {
Main test = new Main();
		
		//sample array unsorted
		char[] sample = {1,4,2,0,3};
		
		//what we expect the output to be when calling intSort()
		char[] result = {0,1,2,3,4};
		
		//calls intsort on sample and casts to output
		char[] output = test.charSort(sample);
		
		//J unit test that both arrays are equivalent
		Assert.assertArrayEquals(output, result);
		
	}

}
