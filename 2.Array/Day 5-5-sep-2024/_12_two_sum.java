
public class _12_two_sum {
  public static String read( int []arr, int target){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) return "YES";
        }
    }
    return "NO";
}
public static void main(String[] args) {
  int arr[]={1,4,3,2,6,4};
  int target=10;
  String s= read(arr, target);
  System.out.println(s);
  
}
}
