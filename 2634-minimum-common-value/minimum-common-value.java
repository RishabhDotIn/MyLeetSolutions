class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        Set<Integer> st=new HashSet<>();

        for(int n:nums2){
            st.add(n);
        }
        long min=99999999999L;

        int i=0;
        

        while(i<nums1.length){

            if(st.contains(nums1[i])){
                if(nums1[i]<min)min=nums1[i];
            }

            i++;
        }
        if(min==99999999999L)return -1;
        return (int)min;
    }
}