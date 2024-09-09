
public class _13_binary_Search {
  public static int binarySearch(int arr[], int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 67, 8, 544, 2 };
    int target = 67;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
  }

}
