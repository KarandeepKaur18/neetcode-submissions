class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Our safe midpoint calculation

            // Jackpot! We found the target
            if (nums[mid] == target) {
                return mid;
            }

            // Step 1: Check if the LEFT half is perfectly sorted
            if (nums[left] <= nums[mid]) {
                // Step 2: Is the target inside this sorted left half?
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Yes, it's here. Discard the right half.
                } else {
                    left = mid + 1;  // No, it must be in the right half.
                }
            } 
            // Step 1 (Alternative): If left isn't sorted, the RIGHT half MUST be perfectly sorted
            else {
                // Step 2: Is the target inside this sorted right half?
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Yes, it's here. Discard the left half.
                } else {
                    right = mid - 1; // No, it must be in the left half.
                }
            }
        }

        // If the loop finishes and we haven't returned mid, it's not here.
        return -1; 
    }
}