class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            

            if(nums[i]!=1){
                if(count<curr)count=curr;
                curr=0;

            }else{
                curr++;
            }
        }
        if(count<curr)count=curr;
        return count;
    }
}