class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        int count = 0;

        if(nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1]){
                count++;
            }else{
                if(count > length ){
                    length = count;
                }
                count = 0;
            }
        }

        length = Math.max(length,count);

        return length+1;
    }
}
