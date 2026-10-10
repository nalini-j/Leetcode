class Solution {
    public String build(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'){
                sb.append('a');
            }
            int ch=(int)s.charAt(i)+1;
            sb.append((char)ch);
        }
        return s+sb.toString();
    }
    public char kthCharacter(int k) {
        String s="a";
        while(s.length()<k){
            s=build(s);
        }
        return s.charAt(k-1);
    }
}