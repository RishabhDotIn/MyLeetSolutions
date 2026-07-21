class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count=0;

        int sum=0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        if(sum/k>=threshold)count++;

        for(int i=0,j=k;j<arr.length;i++,j++){
            sum-=arr[i];
            sum+=arr[j];
            if(sum/k>=threshold)count++;


        }
        return count;


        
    }
}