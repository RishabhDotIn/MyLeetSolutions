class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l= new ArrayList<>();
        int val=0;
        for(int n:nums){
            val=(val*2+n)%5;
            l.add(val==0);
        }
        return l;
    }
}