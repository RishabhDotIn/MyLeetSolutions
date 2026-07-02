class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int curr = 1;
                int currNum = num;
                while (numSet.contains(currNum + 1)) {

                    currNum++;
                    curr++;
                }

                longest = Math.max(longest, curr);
            }
        }

        return longest;

    }
}