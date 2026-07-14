class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n[]=new int[nums.length*2];

        for(int i=0;i<nums.length;i++){
            n[i]=nums[i];
            n[i+nums.length]=nums[i];
        }
        // for(int i=0;nums.length){
        //     n[i+nums.length]=nums[i];
        // }

        return n;
    }
}