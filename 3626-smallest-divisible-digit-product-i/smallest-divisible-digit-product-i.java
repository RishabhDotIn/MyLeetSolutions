class Solution {
    public int smallestNumber(int n, int t) {
        int a=n;
        int i=1;

        while(a!=0){
            i*=(a%10);
            a/=10;

        }
        if(i%t==0)return n;
        return smallestNumber(n+1,t);
    }
}