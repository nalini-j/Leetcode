class Solution {
    public int reverseDegree(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            c+=(97-ch+26)*(i+1);
        }
        return c;
    }
}