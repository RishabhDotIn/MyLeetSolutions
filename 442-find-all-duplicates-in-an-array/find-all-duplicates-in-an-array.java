class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        
        List<Integer> a=new ArrayList<>();
        while(i<nums.length-1){
            int j=i+1;
            if(nums[j]==nums[i]){
                while(j<nums.length && nums[j]==nums[i]){
                    j++;
                }
                a.add(nums[i]);
                i=j;
                
            }
            else{
                i++;
            }
        }

        return a;
        
    }
}