public class _2_shortedArray_or_Not {

  public static boolean isSorted(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {

      } 
      else {
        return false;    
      }
    }
    return  true;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4,5 };
    boolean ans=isSorted(arr);
    System.out.println(ans);

  }
}
