
public class _17_rearrange_Array_sign {

  public static int[] rearrange(int arr[]) {
    int N = arr.length;
    int ans[] = new int[N];
    int positive = 0;
    int negative = 1;
    for (int i = 0; i < ans.length; i++) {
      if (arr[i] > 0) {
        ans[positive] = arr[i];
        positive += 2;
      } else {
        ans[negative] = arr[i];
        negative += 2;

      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { -1, -2, 3, 4, 2, -2 };
    int ans[] = rearrange(arr);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i]+" ");
      
    }
  }

}