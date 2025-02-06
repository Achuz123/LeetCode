class Solution {
    public int tupleSameProduct(int[] nums) {

        Map<Integer, List<int[]>> productMap = new HashMap<>();
        int count = 0;
        
      
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productMap.putIfAbsent(product, new ArrayList<>());
                productMap.get(product).add(new int[]{nums[i], nums[j]});
            }
        }
        
     
        for (List<int[]> pairs : productMap.values()) {
            int n = pairs.size();
            if (n > 1) {
                count += 8 * (n * (n - 1) / 2); 
            }
        }
        
        return count;

        
    }
}
