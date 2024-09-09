public class _9_find_number {

  public static int findNumber(int arr[]) {
    int xor = 0;
    for (int i = 0; i < arr.length; i++) {
      xor = xor ^ arr[i];

    }
    return xor;

  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2,2, 3, 3,  4 };
    int res = findNumber(arr);
    System.out.println(res);

  }
}