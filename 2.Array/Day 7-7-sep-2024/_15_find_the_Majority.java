
public class _15_find_the_Majority {

  public static int majorityElement(int[] v) {
    int count = 0;
    int el = 0;

    // First pass to find a candidate for the majority element
    for (int i = 0; i < v.length; i++) {
      if (count == 0) {
        count = 1;
        el = v[i];
      } else if (v[i] == el) {
        count++;
      } else {
        count--;
      }
    }

    // Second pass to confirm if the candidate is indeed the majority element
    int count1 = 0;
    for (int j = 0; j < v.length; j++) {
      if (v[j] == el) { // Corrected condition
        count1++;
      }
    }

    // Check if the candidate is the majority element
    if (count1 > (v.length) / 2) {
      return el;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] v = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(majorityElement(v)); // Output: 2
  }
}
