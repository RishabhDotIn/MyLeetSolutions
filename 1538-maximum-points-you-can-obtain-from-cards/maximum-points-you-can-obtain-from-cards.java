class Solution {
    public int maxScore(int[] cardPoints,int k) {

        int sum=0;

        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }

        int max=sum;

        int i=k-1;
        int j=cardPoints.length-1;

        while(i>=0){

            sum-=cardPoints[i];
            sum+=cardPoints[j];

            if(sum>max){
                max=sum;
            }

            i--;
            j--;
        }

        return max;
    }
}