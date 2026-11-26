class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int sum = 0;
        int[] ans = new int[2];

        while(right<nums.length){
            if(left == right){
                right++;
                continue;
            }else{
                sum = nums[left] + nums[right];
            
                if(sum == target){
                    ans[0] = left;
                    ans[1] = right;
                    return ans; 
                }else if(right == (nums.length-1)){
                    right = 0;
                    left++;
                }else{
                    right++;
                }

            }
            
        }

        return ans;
    }
}
