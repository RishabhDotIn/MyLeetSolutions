class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int count=0;

        int i=0;

        while(i<n){
            count+=i/8+1;
            i++;
        }

        return count;

    }
}