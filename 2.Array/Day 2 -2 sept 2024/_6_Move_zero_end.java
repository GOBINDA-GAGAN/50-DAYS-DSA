import java.util.*; 
import java.io.*; 


public class _6_Move_zero_end {
  public static void pushZerosAtEnd(ArrayList<Integer> arr) {
    int j = -1;  // To find the first occurrence of zero
    
    // Find the first zero
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) == 0) {
            j = i;
            break;
        }
    }

    // If no zero is found, return
    if (j == -1) return;

    // Move non-zero elements to the front, keep zeros at the end
    for (int i = j + 1; i < arr.size(); i++) {
        if (arr.get(i) != 0) {
            arr.set(j, arr.get(i));
            arr.set(i, 0);
            j++;
        }
    }
}

public static void main(String[] args) {
    // Example usage
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));
    pushZerosAtEnd(arr);
    System.out.println(arr);  // Output: [1, 3, 12, 0, 0]
}
}
