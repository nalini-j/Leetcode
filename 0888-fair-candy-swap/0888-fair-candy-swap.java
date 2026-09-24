class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1=0;
        int s2=0;
        for(int num:aliceSizes){
            s1+=num;
        }
        for(int num:bobSizes){
            s2+=num;
        }
        int[] ans=new int[2];
        for(int num:bobSizes){
            for(int c:aliceSizes){
                if(num==c+(s2-s1)/2){
                    ans[0]=c;
                    ans[1]=num;
                }
            }
        }
        return ans;
    }
}