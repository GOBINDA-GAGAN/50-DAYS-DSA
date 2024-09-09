
import java.util.ArrayList;

public class _18_buy_sell_Stock {

    public static int maximumProfit(ArrayList<Integer> prices) {
        // Initialize the minimum price encountered so far to the first price
        int minPrice = prices.get(0);
        // Initialize maximum profit as 0
        int maxProfit = 0;

        // Iterate over the prices starting from the second element
        for (int i = 1; i < prices.size(); i++) {
            // Calculate potential profit for the current price
            int cost = prices.get(i) - minPrice;
            // Update the maximum profit if the current profit is greater
            maxProfit = Math.max(maxProfit, cost);
            // Update the minimum price encountered so far
            minPrice = Math.min(minPrice, prices.get(i));
        }
        // Return the maximum profit
        return maxProfit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(7);
        prices.add(1);
        prices.add(5);
        prices.add(3);
        prices.add(6);
        prices.add(4);

        int result = maximumProfit(prices);
        System.out.println("Maximum Profit: " + result); // Output should be 5
    }
}
