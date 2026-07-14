class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge case handling
        if (nums == null || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        // Output array ka size n - k + 1 hota hai
        int[] arr = new int[n - k + 1]; 
        int j = 0; // arr array ke liye index tracker
        
        // Deque indices store karega, strictly decreasing order (values ke hisaab se)
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // 1. Agar Deque ka sabse aage wala element window se bahar ho gaya hai, usko hata do
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            
            // 2. Naya element (nums[i]) agar purane elements se bada hai, 
            // toh purane chote elements kisi kaam ke nahi, unhe back se hata do
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            
            // 3. Naye element ka INDEX Deque ke end mein add karo
            dq.offerLast(i);
            
            // 4. Jab window apni puri size (k) pakad le (yani i >= k - 1),
            // toh Deque ke front pe rakha index hi current window ka max hoga
            if (i >= k - 1) {
                arr[j++] = nums[dq.peekFirst()];
            }
        }
        
        return arr;
    }
}