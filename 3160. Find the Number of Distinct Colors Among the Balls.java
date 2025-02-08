import java.util.*;

public class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];

        Map<Integer, Integer> ballColorMap = new HashMap<>(); // Ball → Color mapping
        Map<Integer, Integer> colorCount = new HashMap<>();   // Color → Count mapping
        int uniqueColorCount = 0;

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // If the ball already has a color, update its count
            if (ballColorMap.containsKey(ball)) {
                int oldColor = ballColorMap.get(ball);

                // Decrease count of the old color
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    uniqueColorCount--;  // Remove from unique colors
                }
            }

            // Assign new color to the ball
            ballColorMap.put(ball, color);
            
            // Increase count of the new color
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            if (colorCount.get(color) == 1) {
                uniqueColorCount++;  // New unique color
            }

            // Store the result
            result[i] = uniqueColorCount;
        }

        return result;
    }
}
