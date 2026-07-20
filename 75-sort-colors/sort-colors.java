// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         int low = 0;
//         int high = n - 1;
//         int mid = 0;

//         for (int i = 0; i < n; i++) {
//             if (nums[mid] == 0) {
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 mid++;
//                 low++;

//             } else if (nums[mid] == 1)
//                 mid++;
//             else {
//                 int temp = nums[high];
//                 nums[high] = nums[mid];
//                 nums[mid] = temp;
//                 high--;
//             }
//         }
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,j=0,k=0;
        for(int num:nums){
            if(num==0) i++;
            else if(num==1) j++;
            else k++;
        }
        int index=0;
        while(i-->0){ nums[index++]=0;}
        while(j-->0){ nums[index++]=1;}
        while(k-->0){ nums[index++]=2;}
    }
}