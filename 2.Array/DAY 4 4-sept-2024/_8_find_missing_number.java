
public class _8_find_missing_number {

  public static int findMissing(int arr[], int n) {
    int sum1 = (n * (n + 1) / 2);
    int sum2 = 0;
    for (int i = 0; i < arr.length; i++) {
      sum2 += arr[i];
    }
    return sum1 - sum2;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5 };
    int n = 5;
    int ans = findMissing(arr, n);
    System.out.println(ans);
  }
}