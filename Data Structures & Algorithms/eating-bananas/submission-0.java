class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Lower bound aur upper bound set kar rahe hain
        int left = 1;
        // Tech Magic: Ek line mein max value nikalne ka shortcut
        int right = java.util.Arrays.stream(piles).max().getAsInt();
        
        int ans = right; // Answer store karne ke liye

        // Binary Search lagayenge bounds ke beech
        while (left <= right) {
            int mid = left + (right - left) / 2; // Yeh Koko ki current guessed speed hai
            
            long totalHours = 0; // Use long to avoid integer overflow test cases
            
            // Har pile par jayenge aur check karenge is speed se kitna time lagega
            for (int pile : piles) {
                // Tech Magic Math: Bina Math.ceil() ke ceiling value nikalna
                totalHours += (pile + mid - 1) / mid; 
            }

            // Agar total time given 'h' se kam ya equal hai
            if (totalHours <= h) {
                ans = mid;       // Yeh speed work kar rahi hai, isko save karlo
                right = mid - 1; // Par kya pata isse bhi slow speed par kaam ban jaye? Check lower half
            } else {
                left = mid + 1;  // Speed bahut kam hai, time zyada lag gaya. Speed badhao!
            }
        }
        
        return ans;
    }
}