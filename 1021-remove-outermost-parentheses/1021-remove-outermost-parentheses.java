class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c1++;
                if(c1>1){
                    res+=s.charAt(i);
                }
            }
            else if(s.charAt(i)==')'){
                c2++;
                if(c2<c1){
                    res+=s.charAt(i);
                }
            }
            if(c1==c2){
                c1=0;
                c2=0;
            }
        }
        return res;
    }
}