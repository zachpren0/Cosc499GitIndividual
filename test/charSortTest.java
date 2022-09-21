import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class charSortTest {

	@Test
	public void test() {
Main test = new Main();
		
		//sample array unsorted
		char[] sample = {'a','d','e','c','b'};
		
		//what we expect the output to be when calling intSort()
		char[] result = {'a','b','c','d','e'};
		
		//calls intsort on sample and casts to output
		char[] output = test.charSort(sample);
		
		//J unit test that both arrays are equivalent
		Assert.assertArrayEquals(output, result);
		
	}

}
