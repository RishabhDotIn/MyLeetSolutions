class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);

            int a=nums[i];
            int b=max;

            while(b!=0){
                int temp=a%b;
                a=b;
                b=temp;
            }
            arr[i]=a;
        }

        Arrays.sort(arr);

        int l=0;
        int r=n-1;
        long ans=0;

        while(l<r){
            int a=arr[l];
            int b=arr[r];

            while(b!=0){
                int temp=a%b;
                a=b;
                b=temp;
            }

            ans+=a;
            l++;
            r--;
        }
        return ans;
    }
}