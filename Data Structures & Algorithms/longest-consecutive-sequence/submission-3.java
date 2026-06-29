class Solution {
    public int longestConsecutive(int[] nums) {
        // METHOD 1 : BRUTE FORCE WITH NLOGN time complexity !!

        // int length = 0;
        // int count = 0;

        // if(nums.length == 0){
        //     return 0;
        // }
        
        // Arrays.sort(nums);
        // for(int i =0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         continue;
        //     }
        //     if(nums[i]+1==nums[i+1]){
        //         count++;
        //     }else{
        //         if(count > length ){
        //             length = count;
        //         }
        //         count = 0;
        //     }
        // }

        // length = Math.max(length,count);

        // return length+1;

        // METHOD 2 : n time complexity !! using hashset 

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int count = 1;
        int length = 0;
        for(int num : set){
            if(set.contains(num-1)){
                continue;
            }else{
                int cur = num;
                count  = 1;
                while(set.contains(cur+1)){
                    count++;
                    cur++;
                }
                length = Math.max(length,count);
            }
        }

        return length;
    }
}
