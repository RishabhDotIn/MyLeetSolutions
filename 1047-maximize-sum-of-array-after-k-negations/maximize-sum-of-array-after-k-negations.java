class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
                if(k==0)break;
            }
            
        }

        if(k%2==1){
            int min=0;
            for(int i=1;i<nums.length;i++){
                if(nums[min]>nums[i]){
                    min=i;
                }


            }

            nums[min]=-nums[min];
        }

        int sum=0;

        for(int n:nums){
            sum+=n;
        }
        return sum;


        
    }
}