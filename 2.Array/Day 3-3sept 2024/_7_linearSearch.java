
public class _7_linearSearch {
  public static int linerSearch(int arr[], int n) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        return i;
      }
    }

    return -1;

  }

  public static void main(String[] args) {
    int arr[] = { 3, 5, 7, 3, 1, 3 };
    int n = 7;
    int ans = linerSearch(arr, n);
    System.out.println(ans);
  }

}
