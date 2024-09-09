import java.util.ArrayList;
import java.util.List;

public class _19_leaders_array {
  public static List<Integer> superiorElements(int[] a) {
    ArrayList<Integer> ans = new ArrayList<>();
    int max = a[a.length - 1];
    ans.add(a[a.length - 1]);
    for (int i = a.length - 2; i >= 0; i--)
      if (a[i] > max) {
        ans.add(a[i]);
        max = a[i];
      }
    return ans;
  }

  public static void main(String[] args) {

  }

}
