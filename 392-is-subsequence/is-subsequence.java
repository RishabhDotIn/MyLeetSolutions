class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if(s.length()==0){
            return true;
        }

        int m = s.length();
        int n = t.length();
        int k = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(k)==t.charAt(i)){
                if(k==m-1){
                    return true;
                }
                else{
                    k++;
                }
            }
        }

        return false;
    }
}