class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l=0;
        int r=0;

        int sum=nums[0];
        int ans=Integer.MAX_VALUE;

        while(r<nums.length){

            while(sum>=target){

                ans=Math.min(ans,r-l+1);

                sum-=nums[l];
                l++;
            }

            r++;

            if(r<nums.length){
                sum+=nums[r];
            }

        }

        return ans==Integer.MAX_VALUE?0:ans;
    }
}