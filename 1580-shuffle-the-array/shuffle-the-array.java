class Solution {
    public int[] shuffle(int[] nums, int n) {
        int n1[]=new int[nums.length];
        int j=0;
        int k=nums.length-n;
        for(int i=0;i<nums.length;i++){

            if(i%2==0){
                n1[i]=nums[j];
                j++;
            }else{
                n1[i]=nums[k];
                k++;
            }
            
        }
        return n1;
    }
}