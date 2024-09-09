/**
 * _14_SortArray_0_1_2_
 */
public class _14_SortArray_0_1_2_ {

  public static void sortArray(int arr[]) {
    int count0 = 0;  
    int count1 = 0;  
    int count2 = 0;  
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        count0++;
      } else if (arr[i] == 1) {
        count1++;
      } else {
        count2++;
      }
    }
    for (int i = 0; i < count0; i++) {
      arr[i] = 0;
    }
    for (int i = count0; i < count0 + count1; i++) {
      arr[i] = 1;
    }
    for (int i = count0 + count1; i < arr.length; i++) {
      arr[i] = 2;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 0, 1, 2, 0, 0, 2, 1, 2 };
    sortArray(arr);  
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
