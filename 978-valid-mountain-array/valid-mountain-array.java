class Solution {
    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) return false;

        int i = 0;
        int j = 1;

        while (j < arr.length && arr[i] < arr[j]) {
            i++;
            j++;
        }

        if (i == 0 || i == arr.length - 1)
            return false;

        while (j < arr.length && arr[i] > arr[j]) {
            i++;
            j++;
        }

        return j == arr.length;
    }
}