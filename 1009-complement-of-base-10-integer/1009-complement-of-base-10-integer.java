class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int x=n%2;
            if(x==1){
                sb.append(0);
            }
            else{
                sb.append(1);
            }
            n=n/2;
        }
        sb=sb.reverse();
        int c=0;
        int p=0;
        for(int i=sb.length()-1;i>=0;i--){
            int d=(sb.charAt(i)-'0')*(int)Math.pow(2,p);
            c+=d;
            System.out.println(c);
            p++;
        }
        return c;
    }
}