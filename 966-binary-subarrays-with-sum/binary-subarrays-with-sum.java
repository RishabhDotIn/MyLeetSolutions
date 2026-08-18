class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int r=0;
        int count=0;
        map.put(0,1);
        while(r<arr.length){
            sum+=arr[r];
            if(map.containsKey(sum-goal)){
                count += map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            r++;
        }
        return count;
    }
}