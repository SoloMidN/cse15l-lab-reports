import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
    public void testReverseInPlacetwo() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayExamples.reverseInPlace(arr);
        Assert.assertTrue(Arrays.equals(arr, new int[]{5, 4, 3, 2, 1}));
  }
}
