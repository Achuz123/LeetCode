import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = sumOfDigits(num);
            
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }
        return maxSum;
    }

    public int sumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
