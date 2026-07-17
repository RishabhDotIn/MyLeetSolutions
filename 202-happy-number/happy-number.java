class Solution {
    public boolean isHappy(int n) {
        while(n>0){
            if(n==1)return true;
            if(n<5)return false;
            
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;
            if(sum==1)return true;
            // if(sum==n)return false;
        }
        return false;
    }
}