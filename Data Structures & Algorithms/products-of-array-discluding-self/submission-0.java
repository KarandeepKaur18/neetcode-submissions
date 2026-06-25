class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Step 1: Prefix Products calculate karke output array mein daalo
        // Pehle element ke left mein kuch nahi hai, toh wahan 1 maano
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Step 2: Right side se aao aur Suffix Product ko multiply karte jao
        // Last element ke right mein kuch nahi hai, toh suffix ko 1 se start karo
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            // Current output mein already prefix stored hai, usko suffix se multiply karo
            output[i] = output[i] * suffix;
            
            // Agle step (left wale element) ke liye suffix update karo
            suffix = suffix * nums[i];
        }
        
        return output;
    }
}