class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = 1;
                product = product * nums[i];
            } else {
                prefix[i] = product;
                product = product * nums[i];

            }
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length) {
                suffix[i] = 1;
                product = product & nums[i];
            } else {
                suffix[i] = product;
                product = product * nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

}