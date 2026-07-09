class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=j;
        int n[]=new int[nums.length];
        while(i<j){
            int iS=nums[i]*nums[i];
            int jS=nums[j]*nums[j];

            if(iS>jS){
                n[k--]=iS;
                i++;
            }
            else{
                n[k--]=jS;
                j--;
            }
        }

        n[0]=nums[i]*nums[i];
        return n;
    }
}