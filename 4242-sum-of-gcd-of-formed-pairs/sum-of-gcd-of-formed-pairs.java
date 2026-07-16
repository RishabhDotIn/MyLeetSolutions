class Solution {

    public int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);

            int a=nums[i];
            int b=max;
            arr[i]=gcd(a,b);
        }

        Arrays.sort(arr);

        int l=0;
        int r=n-1;
        long ans=0;

        while(l<r){
            int a=arr[l];
            int b=arr[r];

            ans+=gcd(a,b);
            l++;
            r--;
        }
        return ans;
    }
}