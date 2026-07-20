class Solution {
    public int compress(char[] chars) {

        int i=0;
        int k=0;

        while(i<chars.length){

            int j=i;
            int count=0;

            while(j<chars.length && chars[i]==chars[j] ){
                count++;
                j++;
            }

            chars[k]=chars[i];
            k++;

            if(count>1){
                String s=String.valueOf(count);

                for(int f=0;f<s.length();f++){
                    chars[k]=s.charAt(f);
                    k++;
                }
            }

            i=j;
        }

        return k;
        
    }
}