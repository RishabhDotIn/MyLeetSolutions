class Solution {
    public double findMaxAverage(int[] nums, int k) {


        int i=0;
        int j=0;
        double avg=-999;
        while(i<=nums.length-k){
            j=i+k-1;
            int r=i;
            int sum=0;
            while(r<=j){
                sum+=nums[r++];
            }
            double curr=(double)sum/k;
            if(curr>avg)avg=curr;

            i++;
        }
        return avg;
        
    }
}