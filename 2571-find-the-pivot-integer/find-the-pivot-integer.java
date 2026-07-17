class Solution {
    public int pivotInteger(int n) {

        // formula method
        int sum=n*(n+1)/2;

        // normal method
        // int sum=0
        // for(int i=1;i<=n;i++){
        //     sum+=i;
        // }

        int prefix=0;
        int i=1;
        while(i<=n){
            sum-=i;
            if(sum==prefix)return i;
            prefix+=i;
            i++;
        }
        return -1;
    }
}