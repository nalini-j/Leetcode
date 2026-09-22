class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int c=0;
        int sign=1;
        int i=0;

        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }
        for(;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int d=s.charAt(i)-'0';
                if (c > (Integer.MAX_VALUE - d) / 10) {
                    if (sign == 1) {
                        return Integer.MAX_VALUE;
                    }
                    else {
                        return Integer.MIN_VALUE;
                    }
                }
                c=c*10+d;
            }
            else{
                break;
            }
        }
        return c*sign;
    }
}