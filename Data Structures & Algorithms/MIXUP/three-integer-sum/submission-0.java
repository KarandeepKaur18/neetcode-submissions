class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    // Result store karne ke liye ek Set banaya, taaki duplicate triplets na aayein
    Set<List<Integer>> resultSet = new HashSet<>();
    
    // Step 1: Array ko sort karna bohot zaroori hai Two Pointers ke liye
    Arrays.sort(nums);
    
    // Step 2: Pehla element fix karne ke liye loop (length - 2 tak chalega)
    for (int i = 0; i < nums.length - 2; i++) {
        
        // Step 3: Baki bache array mein Two Pointers lagana
        int left = i + 1;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            
            if (sum == 0) {
                // Agar sum 0 mil gaya, toh list banakar Set mein daal do
                resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                
                // Pointers ko aage-peeche badhao aur possibilities check karne ke liye
                left++;
                right--;
            } 
            else if (sum < 0) {
                // Sum chota hai, toh left pointer aage badhao (kyunki array sorted hai)
                left++;
            } 
            else {
                // Sum bada hai, toh right pointer peeche laao
                right--;
            }
        }
    }
    
    // Set ko wapas List mein convert karke return kar diya
    return new ArrayList<>(resultSet);
}
}
