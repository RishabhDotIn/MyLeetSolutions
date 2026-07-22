class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> a=new HashSet<>();

        for(int n:arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int n:map.values()){
            if(a.contains(n))return false;
            a.add(n);
        }
        return true;
        
    }
}