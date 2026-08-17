class Solution {
    public int minimumSwaps(int[] nums) {

        int l=0;
        int r=nums.length-1;
        int count=0;

        while(l<r){
            if(nums[r]==0){
                r--;
            }
            else if(nums[l]==0 && nums[r]!=0){
                count++;
                l++;r--;
            }else l++;
        }
        return count;
        
    }
}