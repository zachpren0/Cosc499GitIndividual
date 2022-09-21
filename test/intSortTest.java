import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class intSortTest {

	@Test
	public void test() {
		Main test = new Main();
		
		//sample array unsorted
		int[] sample = {1,4,2,0,3};
		
		//what we expect the output to be when calling intSort()
		int[] result = {0,1,2,3,4};
		
		//calls intsort on sample and casts to output
		int[] output = test.intSort(sample);
		
		//J unit test that both arrays are equivalent
		Assert.assertArrayEquals(output, result);
		
		
	}

}
