class Solution {
    public int findGCD(int[] nums) {

        int s=nums[0];
        int l=nums[0];

        for(int n:nums){
            if(n<s)s=n;
            if(n>l)l=n;
        }

        return gcd(s,l);
        
    }

    private int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}