import java.util.*;

public class _10_max_consecutive {

  public static int max_consecutive(int arr[]) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count++;
      } else {
        count = 0;
      }
      max = Math.max(max, count);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = { 1,2,3,3,3,1,1,2};
    int ans = max_consecutive(arr);
    System.out.println(ans);
  }

}
