class Solution {
    public boolean isSubsequence(String s, String t) {

        List<Character> l=new ArrayList<>();

        for(int i=0;i<t.length();i++){
            l.add(t.charAt(i));
        }

        int n=0;

        for(int i=0;i<s.length();i++){

            boolean f=false;

            for(int j=n;j<l.size();j++){

                if(l.get(j)==s.charAt(i)){
                    n=j+1;
                    f=true;
                    break;
                }

            }

            if(!f) return false;
        }

        return true;
    }
}