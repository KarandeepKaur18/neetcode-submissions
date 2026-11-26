class Solution {
    public int[] twoSum(int[] nums, int target) {
        // METHOD 1: 
        // int left = 0;
        // int right = 0;
        // int sum = 0;
        // int[] ans = new int[2];

        // while(right<nums.length){
        //     if(left == right){
        //         right++;
        //         continue;
        //     }else{
        //         sum = nums[left] + nums[right];
            
        //         if(sum == target){
        //             ans[0] = left;
        //             ans[1] = right;
        //             return ans; 
        //         }else if(right == (nums.length-1)){
        //             right = 0;
        //             left++;
        //         }else{
        //             right++;
        //         }

        //     }
            
        // }

        // return ans;


        // METHOD 2 : 
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[]  {map.get(compliment),i}; 
            }

            map.put(nums[i],i);
        }

        return new int[] {};
    }
}
