class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        Arrays.sort(capacity);
        int count=0;
        int total=0;

        for(int i=0;i<apple.length;i++){
            total+=apple[i];
        }
        int r=capacity.length-1;
        while(total>0){
            total-=capacity[r--];
            count++;
        }

        return count;
        
    }
}