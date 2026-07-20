class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        int i=0;
        
        while(i<nums.length-1){
            int j=i+1;
            if(nums[j]==nums[i]){
                while(j<nums.length && nums[j]==nums[i]){
                    j++;
                }
                return(nums[i]);
                
                
            }
            else{
                i++;
            }
        }

        return -1;


        
    }
}