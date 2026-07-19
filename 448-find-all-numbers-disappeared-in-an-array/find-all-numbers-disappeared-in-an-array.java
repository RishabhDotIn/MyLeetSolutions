class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
        List<Integer> a = new ArrayList<>();

        for(int i=1;i<nums[0];i++){ //before 1st element
            a.add(i);
        }

        for(int i=0;i<nums.length-1;i++){

            int diff=nums[i+1]-nums[i];

            if(diff==0) continue;

            if(diff>1){
                int n=nums[i];

                while(n<nums[i+1]-1){
                    n++;
                    a.add(n);
                }
            }
        }

        for(int i=nums[nums.length-1]+1;i<=nums.length;i++){ //after last
            a.add(i);
        }

        return a;
    }
}