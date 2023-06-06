import java.util.Arrays;

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      System.out.println(Arrays.toString(arr)); 
        arr[i] = arr[arr.length - i - 1];
        int temp = arr[i];
        System.out.println(Arrays.toString(arr)); 
        arr[arr.length - i - 1] = temp;
    }
}




}

