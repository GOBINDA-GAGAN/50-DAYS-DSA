public class _1_largest_element_Array {

  public static void largestElement(int arr[]) {
    int LargestElement = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > LargestElement) {
        LargestElement = arr[i];
      }
    }
    System.out.println(LargestElement);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 6, 4, 5 };
    largestElement(arr);

  }

}
