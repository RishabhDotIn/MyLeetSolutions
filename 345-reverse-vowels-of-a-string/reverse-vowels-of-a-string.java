class Solution {
    public String reverseVowels(String s) {
        Set<Character> v=Set.of('A','E','I','O','U','a','e','i','o','u');
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();

        while(i<j){
            while (i < j && !v.contains(arr[i])) {
                i++;
            }

            while (i < j && !v.contains(arr[j])) {
                j--;
            }

            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }
        return new String(arr);
        
    }
}