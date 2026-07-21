class Solution {

    private boolean isVowel(char a){
        return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
    }
    public int maxVowels(String s, int k) {

        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))count++;
        }

        int max=count;
        

        for(int i=0,j=k;j<s.length();i++,j++){
            if(isVowel(s.charAt(i))){
                count--;
            }
            if(isVowel(s.charAt(j))){
                count++;
            }

            if(count>max)max=count;


        }


        return max;
    }
}